# Object Oriendted Design

### How-To
1. Handle ambiguity
    * Who is going to use it?
    * What
    * Where
    * When
    * Why
    * How they are going to use it?

2. Define the core objects
    * Case: a restaurant -> Table, Guest, Party, Order, Meal, Employee, Server and Host

3. Analyze relationships
    * Party should have an array of Guest
    * Server and Host inherit from Employee
    * Each Table has one Party, but each Party may have multiple Tables
    * There is one Host for the restaurant

* Investigate actions
    * A Party walks into the Restaurant
    * A Guset requests a Table from the Host
    * The Host looks up the Reservation and if it exists, assigns the Party to a Table. Otherwise, the Party is added to the end of the list
    * When a Party leaves, the Table is freed and assigned to a new Party in the list
