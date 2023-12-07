# **Electric Scooter Database System**

Database System for Electric Scooters in a city area (represented as an x-y plane).

## **Examples of records**:

### **Example of ScooterObject Array**:
> [{ScooterObject},{ScooterObject},...]

### **Example of ScooterObject**
> Scooter { id: 35, x: 35, y: 100, Battery: 50, Odometer: 345.456 }

## **Example of user Object**:
> User { x: 40, y: 30 }

## **Command guide**

Each arg for command name is seperated by a " ", and is referred to as command args.
Each arg for command values is referred to as a value arg.

## **Guide for command args**

Command args are case-insensitive. Three args are not mandatory, simply as many as needed for the command.

Invalid args will return -
> Error 404: Command Not Found.

**Format**: _shorthand-longhand_

### First args:

* h-help
* a-add
* d-delete
* u-update
* g-get

### Second args:

* u-user
* s-scooter

### Third args:

* i-id
* l-location
* b-battery
* o-odometer
* d-diagonal
* p-proximity

## **Guide for value args**

Each command asks for values one at a time, simply enter return to leave it empty.

Invalid values will return -
> Invalid arg: command failed, no changes made.

## Examble of command:

### Longhand

update scooter location⏎
20⏎
30⏎
50⏎
30   

### Shorthand

u s l⏎
20⏎
⏎
50⏎
30

## **Commands:**

### Format: **Command**  (arg-name: expected type and/or value range (default value)) _//what it does._

### **Help:**

* **help**  () _//returns a list of all commands._

### **On start:**

* **intial user location**  (x-value: +ve int (0), y-value: +ve int(0)) _//asks x & y coords of user on launch, is 0,0 by default._

### **Adding/deleting records:**

* **add scooter**  (x-value: +ve int (0), y-value: +ve int(0), Battery: +ve int < 100 (100), OdometerValue: +ve double (0)) _//adds record with given values._

* **delete scooter**  (ScooterId: +ve int(required)) _//if left empty the command below is implemented._

* **delete scooter**  (x-value: +ve int(0), y-value: +ve (0), arSide: +ve int(1), arSide2: +ve int(arSide)) _//delete records in rectangle of length = arSide, breadth = arSide2 & bottom-left-corner= x,y._

* **delete scooter diagonal**  (/ same as 1st above/ , /same as 2nd above/ , x2-value: +ve int(0), y2-value: +ve int (0)) _//delete records in rectangle whose bottom-left-corner= x,y & top-right-corner= x2,y2._

### **Updating records:**

* **update scooter location**  (ScooterId: +ve int (required), x-value: +ve int (unchanged), y-value: +ve int(unchanged), new-Battery-%: +ve int < 100 (unchanged)) _//self explanatory._

* **update scooter battery**  (ScooterId: +ve int(required), new-Battery-%: +ve int < 100 (required)) _//name says all._

* **update user location**  (x-value: +ve int (0), y-value: +ve int(0)) _//as named._

### **Requesting records:**

* **get user**  () _//returns user location._

* **get scooter**  () _//returns all records._

* **get scooter id**  (ScooterId: +ve int(required), OptionalScooterId: +ve int (ScooterId)) _//returns records by id range, range inclusive._

* **get scooter battery**  (minBattery%: +ve int < 100 (0), maxBatter%: +ve int < 100 (100)) _//returns records by battery, range inclusive._

* **get scooter odometer**  (maxOdometerValue: +ve int (unlimited), minOdometerValue: +ve int < maxOdometerValue (0)) _//returns records by odometer value, range inclusive._

* **get scooter proximity**  (range x: +ve int (5), range y: +ve int (x), minBattery %: +ve int < 100 (0)) _//returns records by distance from user._
