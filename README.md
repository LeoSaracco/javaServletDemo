# javaServletDemo
Prueba de concepto para una webapp con servlets configurado en web.xml y deployado en un Jboss EAP 7.2
Una vez que compiles el proyecto y hagas deploy en el jboss tenés dos casos de uso:
1) DemoServlet ---> http://127.0.0.1:8080/prueba_concepto/prueba 
2) DemoServletParam --> http://127.0.0.1:8080/prueba_concepto/nombre/{valor} 

Éstas clases son configuradas en el web.xml y el contexto de la app es prueba_concepto (declarado en jboss-web.xml)
