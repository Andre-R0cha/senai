/* Defines */
#define _TAREFAS_

/* Includes */
#include "tasks.h"

/* Functions */

void tarefasSetup(void)
{
	// Criacao das tarefas
	// void tarefasTaskCreate(); <--- nao pode esse void aqui
	tarefasTaskCreate();
}

void tarefasInit(void)
{
}

void tarefasTaskCreate(void)
{
	tarefas1TaskCreate();
	tarefas2TaskCreate();
	tarefas3TaskCreate();
}

void tarefasSystemTasksCreate(void)
{
}

static void tarefasTask(void *pvParameters)
{
}

void tarefas1TaskCreate(void)
{
	BaseType_t rc;
	rc = xTaskCreatePinnedToCore(
		tarefas1Task,			  // nome da funcao da tarefa que vai ser executada
		"TAREFAS1",				  // nome da tarefa
		TAREFAS1_TASK_STACK_SIZE, // tamanho da memoria para executar a tarefa
		NULL,					  // parâmetros da tarefa, ou nulo
		TAREFAS1_TASK_PRIORITY,	  // prioridade da tarefa
		&tarefas1TaskHandle,	  // handle da tarefa ou nulo
		TAREFAS1_TASK_CORE		  // core do processador onde vai ser executada a tarefa
	);
	assert(rc == pdPASS);
}

void tarefas2TaskCreate(void)
{
	BaseType_t rc;
	rc = xTaskCreatePinnedToCore(
		tarefas2Task,			  // nome da funcao da tarefa que vai ser executada
		"TAREFAS2",				  // nome da tarefa
		TAREFAS2_TASK_STACK_SIZE, // tamanho da memoria para executar a tarefa
		NULL,					  // parâmetros da tarefa, ou nulo
		TAREFAS2_TASK_PRIORITY,	  // prioridade da tarefa
		&tarefas2TaskHandle,	  // handle da tarefa ou nulo
		TAREFAS2_TASK_CORE		  // core do processador onde vai ser executada a tarefa
	);
	assert(rc == pdPASS);
}

void tarefas3TaskCreate(void)
{
	BaseType_t rc;
	rc = xTaskCreatePinnedToCore(
		tarefas3Task,			  // nome da funcao da tarefa que vai ser executada
		"TAREFAS3",				  // nome da tarefa
		TAREFAS3_TASK_STACK_SIZE, // tamanho da memoria para executar a tarefa
		NULL,					  // parâmetros da tarefa, ou nulo
		TAREFAS3_TASK_PRIORITY,	  // prioridade da tarefa
		&tarefas3TaskHandle,	  // handle da tarefa ou nulo
		TAREFAS3_TASK_CORE		  // core do processador onde vai ser executada a tarefa
	);
	assert(rc == pdPASS);
}

static void tarefas1Task(void *pvParameters)
{
	static int contador = 0;
	for (;;)
	{
		Serial.println("--------------- TAREFA 1 ----------------------");
		Serial.printf("Tarefa 1 - Contador: %d\n\n", ++contador);

		vTaskDelay(pdMS_TO_TICKS(TAREFAS1_TASK_DELAY_MS));
	}
}

static void tarefas2Task(void *pvParameters)
{
	static int contador = 0;
	for (;;)
	{
		Serial.println("--------------- TAREFA 2 ----------------------");
		Serial.printf("Tarefa 2 - Contador: %d\n\n", ++contador);

		// sempre que o resto da divisao de contador por 5 = 0 chama a tarefa 3
		if (contador % 5 == 0) // 5 10 15 20 
		{
			xTaskNotifyGive(tarefas3TaskHandle);
		}

		vTaskDelay(pdMS_TO_TICKS(TAREFAS2_TASK_DELAY_MS));
	}
}

// tarefa 3 roda e acaba (nao é uma tarefa em loop)
static void tarefas3Task(void *pvParameters)
{
	uint32_t rv;
	static int contador = 0;
	for (;;)
	{
		rv = ulTaskNotifyTake(pdTRUE, portMAX_DELAY);
		Serial.println("*************************************************** TAREFA 3 ***********************");
		Serial.printf("Tarefa 3 - Contador: %d\n\n", ++contador);
		vTaskDelay(pdMS_TO_TICKS(TAREFAS3_TASK_DELAY_MS));
	}
}