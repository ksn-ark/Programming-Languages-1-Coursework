Electric Scooter Database, based on co-ordinates

Example of record:

Scooter { id: 35, x: 35, y: 100, Battery: 50, Odometer: 345.456 }

Example of user Object:

User { x: 40, y: 30 }

//Command guide

Each arg is seperated by " " in longhand

\*format : shorthand-longhand

/first args

a-add
d-delete
u-update
g-get

/second args

u-user
s-scooter

/third args

i-id
p-position
b-battery
o-odometer
c-coordinates
p-proximity

/guide for value args

integers seperated by " ", for duplicate commands, command with matching arg count will be executed.

Examble of user command :

update scooter position: 20 30 50 30

or

u s p: 20 30 50 30

or

u s p:20 30 50

spaces right after the ":" and after the final number will be trimmed

list of commands:

//on start

intial user position (x-value: +ve int (default: 0), y-value: +ve int(default:0)) //asks x & y coords of user on launch, is 0,0 by default

//adding/deleting records

add scooter(x-value: +ve int (default : 0), y-value: +ve int(default : 0), Battery : +ve int < 100 (default : 100), OdometerValue : +ve double (default : 0))

delete scooter(ScooterId : +ve int(required))

delete scooter(x-value: +ve int(default : 0), y-value:(default : 0), arSide : +ve int(default : 1), arSideOptional : +ve int(default : arSide)) //delete scooters in a rectangle with length = arSide, breadth = arSideOptional the bottom left corner of which a point at x,y

delete scooter coordinates(/ same as 1st above/ , /same as 2nd above/ , x2-value: +ve int(default : 0), y2-value: +ve int (default : 0)) //delete scooters in a rectangle of which bottom left corner is at x,y and top right corner is at x2,y2

// updating records

update scooter position(ScooterId : +ve int (required), x-value : +ve int (default : 0 [unchanged if default]), y-value: +ve int(default : 0 [unchanged if default]), new-Battery-% : +ve int < 100 (default : 0, remains unchanged if not specified)) //self explanatory

update scooter battery(ScooterId : +ve int(required), new-Battery-% : +ve int < 100 (required)) //name says all

update user position(x-value: +ve int (default : 0), y-value : +ve int(default : 0)) //as named

//requesting records

get user() //returns user position

get scooter() //returns all records

get scooter(ScooterId : +ve int(required)) //returns specific record by id

get scooter by id(ScooterId : +ve int(required), OptionalScooterId : +ve int (default : ScooterId)) //returns record range by id, from 1st id to 2nd id, inclusive of both

get scooter by battery(minBattery% : +ve int < 100 (default :0), maxBatter% : +ve int < 100 (default : 100)) //returns records with battery %'s in the given range, inclusive of both ends

get scooter by Odometer(maxOdometerValue: +ve int(default : -1, treated as unlimited), minOdometerValue: +ve int < maxOdometerValue (default : 0)) //returns records with odometer value in given range, inclusive of both.

get scooter by proximity(range : +ve int (default : 5), minBattery % : +ve int < 100 (default : 30)) //returns records by filters

get scooter by proximity(range x: +ve int (default : 5), range y: +ve int (default : 5), minBattery % : +ve int < 100 (default : 30)) //returns records by filters
