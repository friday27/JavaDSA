# Java Basics

### Multi-Thread

* Multi-thread mechanism is to run multiple code blocks at the same time.
* To start multi-thread in a class, we have to make sure
    1. The class is a subclass of **Thread** `class CTest extends Thread {...}`
    2. Write the thread in the method called **run()**
    3. Use `objName.start()` to start a thread
* We can also use `class CTest extends ASuperClass implements Runnable {...}`
* There're 5 statuses of a thread:
    1. Newly created: When the object is instanced
    2. Runable: When `start()` is called, and every thread in this status will compete for CPU resource or stay in a queue
    3. Runnging: When the thread gets CPU and calls `run()`
    4. Blocked: When `wait()`, `sleep(long millis)` or `join()` is called
        * `wait()` is released by `notify()`
        * `objA.join()` means to finish the thread of objA and then run other threads
    5. Dead: When the thread is completed ot `stop()` is called
* We could set and get priority of a thread
    * `void setPriority(int p)`, where p means priority from 10 to 1
    * `int getPriority()`
    * `MAX_PRIORITY`, `MIN_PRIORITY` and `NORM_PRIORITY` could be use along with setPriority()
* synchronized
    * Sometimes when we want to update a static variable using threads, the result might be wrong since thread A and thread B change the variable at the same time and overwrite one of the other result.
    * To avoid this situation, we could use add **synchornized** keyword to the thread

            public synchronized static void add(int n) {...}

    * When we use synchornized, **deadlock** could happen if the synchornized resources is used by a thread and make other threads wating for it.


### Exception Handling
* Try-catch-finally

        try {
            //...
        }catch(ExceptionClass varName) {
            //...
        }catch(Exception e) {
            // Catch all exceptions
        }finally {
            // Whether there's an exception, this block will be executed
        }

* Thorw exception

        if(b == 0)
            throw new ArithmeticException();

        // or throw exceptions in a method
        public static void aaa(int a, int b) throws ArithmeticException {
            int c;
            c = a/b;
        }

* Self-defined exception class

        class className extend Exception {
            // ...
        }