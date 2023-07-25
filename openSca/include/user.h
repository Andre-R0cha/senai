#ifndef SCA_USERS_H_
#define SCA_USERS_H_

#include <Arduino.h>
//#include <utils.h>

/*
User register
1. Json Format
    {
    "id": "3456345634",
    "enabled": false,
    "free": false,
    "master": false,
    "validity": false,
    "startdate": "YYYY-MM-DD",
    "enddate": "YYYY-MM-DD"
    }
2. Date information according ISO 8601 (YYYY-MM-DDThh:mm:ss.sss+00:00)
    https://www.w3.org/TR/NOTE-datetime
*/

const String USER_DEFAULT_ID = "0000000000";
const String USER_DEFAULT_START_DATE = "0000-00-00";
const String USER_DEFAULT_END_DATE = "0000-00-00";

class ScaUser
{
public:
    // Constructor
    ScaUser(String _id, boolean _enabled, boolean _free, boolean _master, boolean _valid, String _start, String _end);
    ScaUser(void);
    void setId(String value);
    String getId(void);
    void setEnabled(boolean value);
    boolean getEnabled(void);
    void setFree(boolean value);
    boolean getFree(void);
    void setMaster(boolean value);
    boolean getMaster(void);
    void setValidity(boolean value);
    boolean getValidity(void);
    void setStartDate(String value);
    String getStartDate(void);
    void setEndDate(String value);
    String getEndDate(void);

    void reset(void);

private:
    String id;
    boolean enabled;
    boolean free;
    boolean master;
    boolean validity;
    String startDate;
    String endDate;
};

#endif
