package com.proyecto.comunidadautonoma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//La idea es que exista un controlador por cada entidad para tener separado los recursos
//este main controller va manejar cuando alguien entre a la ruta principal de la aplicacion cuando entre a nuestro localhost sin nigun recurso 
// vamos a manjear presicamente esa salida

@Controller
public class MainController {
	
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		String response = "Bienvenido a <a href='http://google.com'>click aqui :v</a> :)";
		return response;
	}
	
}
