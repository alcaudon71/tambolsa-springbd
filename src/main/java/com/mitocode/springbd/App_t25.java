package com.mitocode.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.beans.Marca;
import com.mitocode.service.ServiceMarca;

/**
 * Hello world!
 *
 */
public class App_t25
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Marca mar = new Marca();
    	
    	mar.setId(2);
    	mar.setNombre("Marca2");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("com/mitocode/xml/beans.xml");
    	
    	ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
    	
    	Marca mar3 = (Marca) appContext.getBean("marca3");
    	
    	try {
    		sm.registrar(mar3);
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    }
}
