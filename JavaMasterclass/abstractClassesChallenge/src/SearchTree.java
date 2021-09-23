public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        //other wise start compare form the head of the tree
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                //new item is greater than currentItem
                // move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there's no next item, add here
                    currentItem.setNext(newItem);
                    return true;
                }
            }// end of <0 comparison
            else if (comparison > 0) {
                //new item is smaller that current item
                //move back if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    //there's no previous item, add here
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } //end of >0 comparison
            else {
                //equal, we don't want a duplicates
                // do not add
                System.out.println(newItem.getValue() + " is already present in the tree");
                return false;

            }

        }
        // we cant actually get here, but java complains
        // if there's no return statement
        // so here we go
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
