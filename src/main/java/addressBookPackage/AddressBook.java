package addressBookPackage;

import javax.persistence.*;
import javax.swing.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BuddyInfo> buddyInfos;

    public AddressBook(){this.buddyInfos = new List<BuddyInfo>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<BuddyInfo> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(BuddyInfo buddyInfo) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends BuddyInfo> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends BuddyInfo> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public BuddyInfo get(int index) {
            return null;
        }

        @Override
        public BuddyInfo set(int index, BuddyInfo element) {
            return null;
        }

        @Override
        public void add(int index, BuddyInfo element) {

        }

        @Override
        public BuddyInfo remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<BuddyInfo> listIterator() {
            return null;
        }

        @Override
        public ListIterator<BuddyInfo> listIterator(int index) {
            return null;
        }

        @Override
        public List<BuddyInfo> subList(int fromIndex, int toIndex) {
            return null;
        }
    };}
    public void setBuddyInfos(List<BuddyInfo> buddies) {
        this.buddyInfos = buddies;
    }

    public List<BuddyInfo> getBuddyInfos() {
        return buddyInfos;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }


    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null)
            buddyInfos.add(aBuddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyInfos.remove(buddy);
    }


}
