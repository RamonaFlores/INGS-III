package ui;

import model.IteratorPattern.Iterator;
import model.IteratorPattern.NameRepository;

import javax.naming.Name;

public class IteratorPatternDemo {
    public static void main(String[] args){
        NameRepository nameRepository = new NameRepository();
        for (Iterator iter = nameRepository.getIterator();
             iter.hasNext();){
            String name= (String)iter.next();
            System.out.println("Name : "+ name);
        }
    }
}
