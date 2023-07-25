#ifndef API_H
#define API_H


#include  <Arduino.h>
#include "freertos/FreeRTOS.h"
#include "freertos/task.h"
#include <WiFi.h>
#include "SPIFFS.h"
#include <HTTPClient.h>





void apiSetup(void);
void apiRequest(void);


#ifdef  _API_


#endif


#endif