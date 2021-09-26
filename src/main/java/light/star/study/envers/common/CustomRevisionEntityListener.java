package light.star.study.envers.common;

import org.hibernate.envers.RevisionListener;

public class CustomRevisionEntityListener implements RevisionListener {

    @Override
    public void newRevision(Object o) {
        CustomRevisionEntity customRevisionEntity = (CustomRevisionEntity) o;
        customRevisionEntity.setCustomColumn("username");
    }
}
