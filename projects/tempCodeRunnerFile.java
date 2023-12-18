sList.add("A");
        sList.add("B");
        ListIterator<String> iter = sList.listIterator();
        if(iter.hasNext()){
                iter.next();
                iter.add("C");
        }
        if(iter.hasPrevious()){
                iter.previous();
                iter.add("D");
        }
        sList.add("E");
        System.out.println(sList);