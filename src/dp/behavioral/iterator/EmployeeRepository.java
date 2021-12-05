package dp.behavioral.iterator;

public class EmployeeRepository implements Sector {

    public String[] employees = {"David", "Scott", "Rhett", "Andrew", "Jessica"};

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator extends Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index < employees.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}