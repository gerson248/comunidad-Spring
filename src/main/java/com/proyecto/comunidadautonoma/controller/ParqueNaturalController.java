package com.proyecto.comunidadautonoma.controller;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;


import com.proyecto.comunidadautonoma.model.ParqueNatural;
import com.proyecto.comunidadautonoma.service.ParqueNaturalService;



@Controller
@RequestMapping(value="/v1")
public class ParqueNaturalController {
	@Autowired
	private ParqueNaturalService _parqueNaturalService;
	
	//GET
	@RequestMapping(value="/parqueNatural", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<ParqueNatural>> getParqueNaturales(@RequestParam(value="nombre", required=false) String nombre){
		List<ParqueNatural> parqueNaturales = new ArrayList<>();
		//ejecutamos una validacion
		if(nombre == null) {
			parqueNaturales = _parqueNaturalService.findAllParqueNaturales();
			if (parqueNaturales.isEmpty()) {
				return new ResponseEntity(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<List<ParqueNatural>>(parqueNaturales, HttpStatus.OK);
		} else {
			ParqueNatural parqueNatural = _parqueNaturalService.findByName(nombre);
			if(parqueNatural == null) {
				return new ResponseEntity(HttpStatus.NOT_FOUND);
			}
			
			parqueNaturales.add(parqueNatural);
			return new ResponseEntity<List<ParqueNatural>>(parqueNaturales, HttpStatus.OK);
		} 
	}
	
	//POST
	@RequestMapping(value="/parqueNatural", method = RequestMethod.POST, headers = "Accept=application/json")
	//Response Entity es la forma mas simple para manejar informacion en json
	//RequestBody una solicitud
	public ResponseEntity<?> createParqueNatural(@RequestBody ParqueNatural parqueNatural, UriComponentsBuilder uriComponentsBuilder){
		// validamos el objeto que traigo tenga datos
		if (parqueNatural.getNombre().equals(null) || parqueNatural.getNombre().isEmpty()) {
			//si esta vacio nos devolvera esto
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		
		if (_parqueNaturalService.findByName(parqueNatural.getNombre()) != null) {
			//si esto nos devuelve un objeto diferente a nulo significa que existe ejemplo twiter y avatar 4
			return new ResponseEntity(HttpStatus.NO_CONTENT);			
		}
		
		// si es diferente d enulo guardaremos el socialMedia
		_parqueNaturalService.saveParqueNatural(parqueNatural);
		ParqueNatural parqueNatural2 = _parqueNaturalService.findByName(parqueNatural.getNombre());
		HttpHeaders headers = new HttpHeaders();
		//devolver una url del recurso que acabamos de insertar para luego consultarlo 
		headers.setLocation(
				uriComponentsBuilder.path("/v1/excursiones/{id}")
				.buildAndExpand(parqueNatural2.getCodPN())
				.toUri()
				);
		//devolvemos el recurso (una URL) y un http status que se creo 
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
}
