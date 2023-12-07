# **Cycle Database System**

Java based renting system for cycles in a city area (represented as an x-y plane).

## **Examples of records**:

### **Example of cycleObject Array**:
> [{cycleObject},{cycleObject},...]

### **Example of cycleObject**
> cycle { id: 35, x: 35, y: 100, Battery: 50, rentedHours: 7 }

## **Example of user Object**:
> User { x: 40, y: 30, rentedHours: 12 }

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
* r-rent

### Second args:

* u-user
* c-cycle

### Third args:

* i-id
* l-location
* b-bill
* r-rentedHours
* a-areaRange
* p-proximity

## **Guide for value args**

Each command asks for values one at a time, simply enter return to leave it empty.

Invalid values will return -
> Invalid arg: command failed, no changes made.

## Examble of command:

### Longhand

update cycle location⏎
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

* **rent per hour** (rent per hour: +ve non-zero float (0.5)) _//asks for rent per hour rate_

### **Adding/deleting records:**

* **add cycle**  (x-value: +ve int (0), y-value: +ve int(0), rentedHours: +ve double (0)) _//adds record with given values._

* **delete cycle**  (cycleId: +ve int(required)) _//if left empty the command below is implemented._

* **delete cycle**  (x-value: +ve int(0), y-value: +ve (0), arSide: +ve int(1), arSide2: +ve int(arSide)) _//delete records in rectangle of length = arSide, breadth = arSide2 & bottom-left-corner= x,y._

* **delete cycle area**  (/ same as 1st above/ , /same as 2nd above/ , x range: +ve int(0), y range: +ve int (x)) _//delete records in a rectangle of sides (x range*2)-1,(y range*2 -1) range centered at x,y_

### **Updating records:**

* **update cycle location**  (cycleId: +ve int (required), x-value: +ve int (unchanged), y-value: +ve int(unchanged)) _//self explanatory._

* **update user location**  (x-value: +ve int (0), y-value: +ve int(0)) _//as named._

### **Requesting records:**

* **get user**  (ratePerHour in euro : +ve non-zero float (0.5) ) _//returns user location & rented hours & total spending in euro._

* **get user location**  () _//returns user location_

* **get user rentedHours** () _//returns user rented hours_

* **get user bill** (ratePerHour in euro : +ve non-zero float (0.5)) _//returns user total spending_

* **get cycle**  () _//returns all records._

* **get cycle id**  (cycleId: +ve int(required), OptionalcycleId: +ve int (cycleId)) _//returns records by id range, range inclusive._

* **get cycle rentedHours**  (maxrentedHours: +ve int (unlimited), minrentedHours: +ve int <= maxrentedHours (0)) _//returns records by rented hours, range inclusive._

* **get cycle proximity**  (range x: +ve int (5), range y: +ve int (x)) _//returns records by distance from user._

### **Renting:**

* **rent cycle**  (cycleId1: +ve int (required), cycleId2: +ve int (cycleId1), hours to rent: +ve non-zero int < 25 (1), rate per hour: +ve float (0.5)) _//rents cycles in inclusive range(cycleId1,cycleId2), calculates bill and asks for confirmation_

* **rent cycle location**  (number of cycles : +ve nono-zero int (1), hours to rent: +ve non-zero int < 25 (1), x-value: +ve int(0), y-value: +ve (0), rate per hour: +ve float (0.5)) _//rents cycles by location, if enough cycles, calculates bill and asks for confirmation, if not enough cycles presents invoice for max cycles & asks for confirmation, if more cycles than needed at location lowest id's are rented_

* **rent cycle proximity** (number of cycles : +ve non-zero int (1), hours to rent: +ve non-zero int < 25 (1), range x: +ve int (5), range y: +ve int (5), rate per hour: +ve float (0.5)) _//rents cycles by proximity to user location, handles excess, matching number and scarcity of cycles as in previous command_

* **rent cycle area**  (number of cycles : +ve non-zero int (1), hours to rent: +ve non-zero int < 25 (1), x-value: +ve int(0), y-value: +ve (0), range x: +ve int (5), range y: +ve int (5), rate per hour: +ve float (0.5)) _//rents cycles by proximity to given location, handles excess, matching number & scarcity of cycles as in previous command_
