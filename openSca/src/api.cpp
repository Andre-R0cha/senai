/*
  Copyright (c), 2023 - NUTES - Nucleo de Tecnologias Estrategicas na Saude
  http://nutes.uepb.edu.br/
  All rights reserved.
*/

/* Defines */
#define _API_

/* Includes */
#include "api.h"

/* Functions */

void apiSetup(void)
{


}

void apiRequest(void)
{
  String url = "http://192.168.181.41:5000/api/portas/usuarios/";
  url += "63498e321672e5e3c369e271";

  HTTPClient http;
  http.begin(url);

  int httpResponseCode = http.GET();
  if (httpResponseCode > 0)
  {
    String response = http.getString();
    Serial.println("Resposta da API:");
    Serial.println(response);
  }
  else
  {
    Serial.print("Erro na solicitação GET. Código de resposta HTTP: ");
    Serial.println(httpResponseCode);
  }

  http.end();
}



void apiPost(void)
{

  String url = "http://192.168.181.41:5000/api/portas/usuarios/";     // url do post
  url += "63498e321672e5e3c369e271";                                  // add da url
  
  HTTPClient http;                                                    // iniciando o post
  http.begin(url);
  http.addHeader("Content-Type", "text/plain");

   int httpResponseCode = http.POST("POSTING from ESP32");

   if(httpResponseCode>0){

    String response = http.getString();                       //Get the response to the request

    Serial.println(httpResponseCode);                         //Print return code
    Serial.println(response);                                 //Print request answer

   }else{

    Serial.print("Error on sending POST: ");
    Serial.println(httpResponseCode);

   }


}
