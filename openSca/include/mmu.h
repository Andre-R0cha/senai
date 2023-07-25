#ifndef SCA_MMU_H_
#define SCA_MMU_H_

/* Infomation SPIFFS deprecated
    https://arduino-esp8266.readthedocs.io/en/latest/filesystem.html
*/
#include <FS.h>
#include <SPIFFS.h>
#include <Arduino.h>
//#include <user.h>
#include <config.h>
//#include <ArduinoJson.h>

/*----------------------------------------------------------------
user file at spiffs

/users/1234567890.json
/config/config.json
/events/YYYYMMDD.json

*/


#define MMU_ALL_USERS 0
#define MMU_NORMAL_USERS 1
#define MMU_MASTER_USERS 2

#define MMU_VERBOSE 1

#define USER_JSON_SIZE 256
#define EVENT_JSON_SIZE 128
#define CONFIG_JSON_SIZE 1536 // TODO (jean) - check new size

#define USER_REGISTER_SIZE 16

#define USER_FILENAME_SIZE 10
#define REG_EXTENSION_SIZE 5
#define REG_USER_FILENAME_SIZE (USER_FILENAME_SIZE + REG_EXTENSION_SIZE)

#define MMU_JSON_ENABLED 1
#define MMU_JSON_DISABLED 0

#define MMU_JSON MMU_JSON_ENABLED


// externs
//extern DynamicJsonDocument mmuUserJson;

const String ROOT_PATH = "/";
const String CONFIG_PATH = "/config/";
const String USER_PATH = "/users/";
const String EVENT_PATH = "/events/";
const String WEB_PATH = "/www/";


const String SEPARATOR = ",";
const String FILE_EXTENSION = ".json";

const String CONFIG_FILENAME = CONFIG_PATH + "config" + FILE_EXTENSION;

enum mmuEntity
{
    MMU_ALL,
    MMU_CONFIG,
    MMU_USER,
    MMU_EVENT
};

class ScaMmu
{
public:
    // Constructor
   /* ScaMmu();
    void setUsersCount(int value);
    int getUsersCount(void);
    void setFileSystemError(boolean value);
    boolean getFileSystemError(void);

    boolean insert(ScaUser *value);
    boolean remove(ScaUser *value);
    boolean update(ScaUser *value);
    boolean read(String *id, ScaUser *value);
    boolean exists(ScaUser *value, String *fullName);

    boolean insert(ScaConfig *value);
    boolean update(ScaConfig *value);
    boolean read(ScaConfig *value);
    boolean exists(String *fullName);

    void printPrettyUser(ScaUser *value);
    void printPrettyConfig(ScaConfig *value);

    boolean convertConfigToJson(void);
    boolean convertConfigToObject(void);

    boolean init(void);
    size_t getSize(void);
    size_t getUsed(void);

    void listAllFiles(void);
    void clearUsers(int value);
    void clearUserEvents(void); // TODO (jean) - create function
    void clearSystemEvents(void); // TODO (jean) - create function

private:
    int usersCount;
    boolean fileSystemError;
    int countUsers(void);
    */
};

#endif
