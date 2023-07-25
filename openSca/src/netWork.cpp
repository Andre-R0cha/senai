#define _NETWORK_

#include "netWork.h"

const char *NETWORK_SSID = "NUTES 2";
const char *NETWORK_PWD = "Nut3s.2022";

void netWorkSetup(void)
{
}

void netWorktInit(void)
{
}

void networkConnect(void)
{
  Serial.print("trying to connect to #");
  Serial.print(NETWORK_SSID);
  Serial.println(" -> ");

  WiFi.begin(NETWORK_SSID, NETWORK_PWD);
  // Wait for connection
  while (WiFi.status() != WL_CONNECTED)
  {
    delay(500);
    Serial.print(".");
  }
  Serial.println("");
  Serial.print("Connected to ->  ");
  Serial.print(NETWORK_SSID);
  Serial.print("# IP address: ");
  Serial.println(WiFi.localIP());
  WiFi.setAutoReconnect(true);
  WiFi.persistent(true);
}
