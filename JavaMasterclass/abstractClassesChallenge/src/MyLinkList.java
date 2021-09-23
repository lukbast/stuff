public class MyLinkList implements NodeList {

    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            //the list was empty, new item becomes a root
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                //new item is greater, move next is possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {//there's no next
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            }//end of <0 comparison
            else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);

                } else {

                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;

                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present, not added  ");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!=null){
            System.out.println("Deleting item "+ item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem!=null){
            int comparison = currentItem.compareTo(item);
            if (comparison==0){
                if(currentItem ==this.root){
                    this.root=currentItem.next();
                } else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next()!=null){
                        currentItem.setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparison<0){
                currentItem =currentItem.next();
            } else {//comparison>0
                // We are at item greater than the one to be deleted
                // so item is no the list
                return false;
            }

        }
        //we reach end of the list without finding item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("the List is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }

        }

    }

}