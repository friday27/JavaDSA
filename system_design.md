# System Design

### References
* Hiredintech System Design Lesson
* [System Design Primer](https://github.com/donnemartin/system-design-primer)

### How-To
1. Outline use cases and constraints
2. Draw a high level design
3. Design core components
4. Scale the design 

-----
### Scalability
4 ways to achieve scalability
**Copy-n-paste the SD note from work**
1. Load Balancing and Cloned Servers
    * Horizontal Scaling
        * Active-Passive
        * Master-Slave
        * Cluster
        * Sharding
2. Switch to NoSQL
3. In-Memory Cache
4. Asynchronism

-----
### [Data Sharding](http://highscalability.com/blog/2009/8/6/an-unorthodox-approach-to-database-design-the-coming-of-the.html)
* Groups of N users are stored together in what are called shards.
* Advantages
    * Data are more highly availabl:. Since the shards are independent a failure in one doesn't cause a failure in another. And if you make each shard operate at 50% capacity it's much easier to upgrade a shard in place.
    * Faster queries: Smaller amounts of data in each user group mean faster querying.
    * More write bandwidth: With no master database serializing writes you can write in parallel which increases your write throughput. Writing is major bottleneck for many websites.
* Disadvantages/Problems
    * Rebalancing data: moving data from shard to shard required a lot of downtime.
    * How to do data partition?

-----
### Key Concepts
* Horizontal vs. Vertical Scaling
A system can be scaled one of two ways.
    1. Vertical scaling means increasing the resources of a specific node. For example, you might add additional memory to a server to improve its ability to handle load changes. Vertical scaling is generally easier than horizontal scaling, but it's limited. You can only add so much memory or disk space.
    2. Horizontal scaling means increasing the number of nodes. For example, you might add additional servers, thus decreasing the load on anyone server.

* Load Balancer
Load balancer allows a system to distribute the load evenly so that one server doesn't crash and take down the whole system. To do so, you have to build out a network of cloned servers that all have essentially the same code and access to the same data.

* Database Partitioning (Sharding)
Sharding means splitting the data across multiple machines while ensuring you have a way of figuring out which data is on which machine. Many architectures actually end up using multiple partitioning schemes.
A few common ways of partitioning include:
    * Vertical Partitioning: This is basically partitioning by feature. For example, if you were building a social network, you might have one partition for tables relating to profiles, another one for messages, and so on. One drawback of this is that if one of these tables gets very large, you might need to repartition that database (possibly using a different partitioning scheme).
    * Key-Based (or Hash-Based) Partitioning: This uses some part of the data (for example an ID) to partition it. A very simple way to do this is to allocate N servers and put the data on mod. One issue with this is that the number of servers you have is effectively fixed. Adding additional servers means reallocating all the dataa very expensive task. (solution: consistent hashing)
    * Directory-Based Partitioning: In this scheme, you maintain a lookup table for where the data can be found. This makes it relatively easy to add additional servers, but it comes with two major drawbacks. First, the lookup table can be a single point of failure. Second, constantly accessing this table impacts performance.

* Caching
An in-memory cache can deliver very rapid results. It is a simple key-value pairing and typically sits between your application layer and your data store.
When an application requests a piece of information, it first tries the cache. If the cache does not contain the key, it will then look up the data in the data store.
When you cache, you might cache a query and its results directly. Or, alternatively, you can cache the specific object (for example, a rendered version of a part of the website, or a list of the most recent blog posts).

* Networking Metrics
Some ofthe most important metrics around networking include:
    * Bandwidth: This is the maximum amount of data that can be transferred in a unit of time. It is typically expressed in bits per second (or some similar ways, such as gigabytes per second).
    * Throughput: Whereas bandwidth is the maximum data that can be transferred in a unit of time, throughput is the actual amount of data that is transferred. Bandwidth is the number of items that can be transferred per unit of time, in the best possible conditions.Throughput is the time it really takes, when the machines perhaps aren't operating smoothly.
    * Latency: This is how long it takes data to go from one end to the other. That is, it is the delay between the sender sending information (even a very small chunk of data) and the receiver receiving it.

### Database
* Denormalized vs. Normalized Databases
Normalized databases are designed to minimize redundancy, while denormalized databases are designed to optimize read time.
In a traditional normalized database with data like Courses and Teachers, Courses might contain a column called TeacherID, which is a foreign key to T eacher. One benefit of this is that information about the teacher (name, address, etc.) is only stored once in the database.The drawback is that many common queries will require expensive joins.
Instead, we can denormalize the database by storing redundant data. For example, if we knew that we would have to repeat this query often, we might store the teacher's name in the Courses table. Denormalization is commonly used to create highly scalable systems.

