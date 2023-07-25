#ifndef APP_H
#define APP_H

/* Includes */
#include <Arduino.h>
#include "freertos/FreeRTOS.h"
#include "freertos/task.h"
#include "network.h"
#include "rfid.h"
#include "api.h"



/* Defines */
#define APP_LOOP_DELAY_MS     100
#define APP_INITIAL_DELAY_MS  2000
#define APP_MONITOR_SPEED     115200

/* Data Types - typedefs, structs, unions and/or enumerated */

/* Public Functions */
void appSetup(void);
void appTaskCreate(void);
void appSystemTasksCreate(void);

/* Local Functions */
#ifdef _APP_

void appInit(void);
static void appTask(void *pvParameters);

#endif

/* Public Variables */

/* Local Variables */
#ifdef _APP_
static TaskHandle_t appTaskHandle = NULL;
#endif

#endif