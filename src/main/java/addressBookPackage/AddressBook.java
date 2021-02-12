package addressBookPackage;

import javax.persistence.*;
import javax.swing.*;
import java.util.Collection;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<BuddyInfo> buddyInfos;

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
