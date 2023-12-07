# **Electric Scooter Database, based on co-ordinates**

## **Example of record**:

Scooter { id: 35, x: 35, y: 100, Battery: 50, Odometer: 345.456 }

## **Example of user Object**:

User { x: 40, y: 30 }

## **Command guide**

Each arg for command name is seperated by a " ", and is referred to as command args.
Each arg for command values is seperated by a " ", and is referred to as value args.

Command args are case-insensitive

Command args and value args are seperated by a ":".
Spaces right after the ":" and after the final number will be trimmed

## **Guide for command args**

**format** : _shorthand-longhand_

### first arg

a-add
d-delete
u-update
g-get

### second args

u-user
s-scooter

### third args

i-id
p-position
b-battery
o-odometer
c-coordinates
p-proximity

## **Guide for value args**

Integers seperated by " "
All non required args are optional and default to the default value when left empty.
For duplicate commands, command with matching arg count will be executed.

## Examble of command :

### Longhand

update scooter position: 20 30 50 30
or
update scooter position:20 30 50 30   

### Shorthand

u s p: 20 30 50 30
or
u s p:20 30 50

## **Commands:**

### format : Command-name (arg : expected type and/or value range (default value)) _//what it does_

### **On start**

intial user position (x-value: +ve int (0), y-value: +ve int(0)) _//asks x & y coords of user on launch, is 0,0 by default_

### **Adding/deleting records**

add scooter(x-value: +ve int (0), y-value: +ve int(0), Battery : +ve int < 100 (100), OdometerValue : +ve double (0)) _//adds record with given values_

delete scooter(ScooterId : +ve int(required))

delete scooter(x-value: +ve int(0), y-value:(0), arSide : +ve int(1), arSideOptional : +ve int(arSide)) _//delete records in rectangle of length = arSide, breadth = arSideOptional & bottom-left-corner= x,y_

delete scooter coordinates(/ same as 1st above/ , /same as 2nd above/ , x2-value: +ve int(0), y2-value: +ve int (0)) _//delete records in rectangle whose bottom-left-corner= x,y & top-right-corner= x2,y2_

### **Updating records**

update scooter position(ScooterId : +ve int (required), x-value : +ve int (unchanged), y-value: +ve int(unchanged), new-Battery-% : +ve int < 100 (unchanged)) //self explanatory

update scooter battery(ScooterId : +ve int(required), new-Battery-% : +ve int < 100 (required)) //name says all

update user position(x-value: +ve int (0), y-value : +ve int(0)) //as named

### **Requesting records**

get user() //returns user position

get scooter() //returns all records

get scooter(ScooterId : +ve int(required)) //returns specific record by id

get scooter by id(ScooterId : +ve int(required), OptionalScooterId : +ve int (ScooterId)) //returns records by id range, range inclusive

get scooter by battery(minBattery% : +ve int < 100 (0), maxBatter% : +ve int < 100 (100)) //returns records by battery, range inclusive

get scooter by Odometer(maxOdometerValue: +ve int (unlimited), minOdometerValue: +ve int < maxOdometerValue (0)) //returns records by odometer value, range inclusive

get scooter by proximity(range : +ve int (5), minBattery % : +ve int < 100 (30)) //returns records by filters

get scooter by proximity(range x: +ve int (5), range y: +ve int (5), minBattery % : +ve int < 100 (0)) //returns records by filters
