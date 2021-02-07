public class Employee implements Iterable {

    String[] employees = {"ram", "shyam", "deepak", "rajiv", "firoz"};


    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            while (index < employees.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            while (this.hasNext())
                return employees[index++];
            return null;
        }
    }
}
