/*
    Design a Parking Lot
    https://www.educative.io/courses/grokking-the-object-oriented-design-interview/gxM3gRxmr8Z

    Main classes for this parking lot system:
    * ParkingLot: The central part of the organization
    * ParkingFloor: The parking lot will have many parking floors
    * ParkingSpot: Each parking floor will have many parking spots 
        * There would be different types of parking spots like handicapped, normal, large, mortorcycle and electric
    * Account: For admin and parking attendant
    * ParkingTicket: Customer will take a ticket when they enter the parking lot
    * Vehicle: Car, Truck, Electric car, Van, Motorcycle
    * EntrancePanel: Print tickets
    * ExitPanel: Collect parking fee according to the parking ticket
    * Payment: Support credit card and cash
    * ParkingRate: Keep track of the hourly parking rates
    * ParkingDisplayBoard: One at each parking floor to show available parking spots for each type
    * ParkingAttendantPanel: encapsulate all the operations an attendant can perform, like scanning tickets and processing payments
    * ElectricPanel: same as ParkingAttendantPanel
*/

public enum VehicleType {
    CAR, TRUCK, ELECTRIC, VAN, MOTOR
}

public enum ParkingSpotType {
    HANDICAPPED, NORMAL, LARGE, MOTOR, ELECTRIC
}