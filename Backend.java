import java.util.LinkedList;
public class Backend {
    private RedBlackTree<City> tree = new RedBlackTree();
    private LinkedList<City> traversedCities = new LinkedList();




    /**
     * This method will return a linked list of the cities within the given distance from Madison
     * @param distance the distance around madison to find cities
     * @return a linked list of the City objects within the given distance
     */
    public LinkedList<City> getCitiesWithin(int distance){


        return null;
    }

    /**
     * This method will return a list storing an in order traversal of the red black tree
     * @return an in order traversal of the red black tree
     */
    public LinkedList<City> getTreeInOrder(){
        //clear the list of traversed cities
         traversedCities = new LinkedList();
        // call the helper method to traverse and gather the cities into the traversedCities field
        helpGetTreeInOrder(tree.root);


        return traversedCities;
    }

    /**
     * This method will help to traverse and store the tree in order.
     * @return
     */
    private void helpGetTreeInOrder(RedBlackTree.Node<City> current){
        if (current != null){
            // recursive call down left side
            helpGetTreeInOrder(current.leftChild);
            // add to the list
            traversedCities.add(current.data);
            // recursive call down the right side
            helpGetTreeInOrder(current.rightChild);
        }
        return;
    }

    public void add(City city){
    try {
        tree.insert(city);
    }
    catch (IllegalArgumentException e){ // catch an exception thrown if the tree already contained that city
        System.out.println(e.getMessage()); // potentially change depending on how we want to implement
    }
    catch (NullPointerException e1) { // catch an exception thrown if the data passed in is null
        System.out.println(e1.getMessage()); // potentially change depending on how we want to implement
    }
        return;
    }

}