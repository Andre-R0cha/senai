/*
  Copyright (c), 2023 - NUTES - Nucleo de Tecnologias Estrategicas na Saude
  http://nutes.uepb.edu.br/
  All rights reserved.
*/

/* Defines */
#define _APP_

/* Includes */
#include "app.h"

/* Functions */

void appSetup(void)
{

    Serial.begin(APP_MONITOR_SPEED);
    Serial.printf("ta pegando ate aqui ");
   networkConnect();

   vTaskDelay(APP_INITIAL_DELAY_MS);
   apiRequest();


}

void appInit(void)
{
}

void appTaskCreate(void)
{
}

void appSystemTasksCreate(void)
{
}

static void appTask(void *pvParameters)
{
}
