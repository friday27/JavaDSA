# Java Concepts

### Collection framework
* **ArrayList** An ArrayList is a dynamically resizing array, which grows as you insert elements.

* **Vector** A vector is very similar to an ArrayList, except that it is **synchronized**.
        
        Vector<String> vect = new Vector<>();
        vect.add("a");
        vect.get(0);

* **LinkedList**

        LinkedList<Integer> list = new LinkedList<>();
        list.add(27);
        list.addFirst(6);
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

* **HashMap**