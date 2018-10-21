package io.github.matchjobsapp.matchjobs.model;

import java.io.Serializable;
import java.util.Objects;
/**
 * ╭────────────────────────────────────────────────────╮
 * │                                                    │
 * │   @author: Ivam H. M. Santos                       │
 * │   https://www.linkedin.com/in/ivamsantos           |
 * |   ivamks@gmail.com                                 |
 * |   Project: MatchJobs                               |
 * |   Create at 21/10/18                               │
 * │                                                    │
 * ╰────────────────────────────────────────────────────╯
 */
public class AbstractModel<ID extends Serializable> implements Serializable {

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    private ID id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractModel)) return false;
        AbstractModel<?> that = (AbstractModel<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
