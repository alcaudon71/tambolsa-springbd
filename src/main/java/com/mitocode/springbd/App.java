package com.mitocode.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Equipo;
import com.mitocode.beans.Jugador;
import com.mitocode.beans.Marca;
import com.mitocode.service.ServiceJugador;
import com.mitocode.service.ServiceMarca;

/**
 * Hello world!   MitoCode MitoCode
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
    	
    	//ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
    	ServiceJugador sm = (ServiceJugador) appContext.getBean("serviceJugadorImpl");
    	
    	//Marca mar3 = (Marca) appContext.getBean("marca3");
    	//Equipo eq1 = appContext.getBean("equipo1", Equipo.class);
    	
    	Jugador jugador = appContext.getBean("jugador1", Jugador.class);
    	
    	try {
    		//sm.registrar(mar3);
    		sm.registrar(jugador);
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    }
}
