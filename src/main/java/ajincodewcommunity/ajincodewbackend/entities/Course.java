/**
 * <p>Copyright (C) Calade Technologies, Inc - All Rights Reserved Unauthorized copying of this
 * file, via any medium is strictly prohibited Proprietary and confidential
 */
package ajincodewcommunity.ajincodewbackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * <p>Created 23 juin 2025</p>
 */
@Entity
@Data
public class Course {
    @Id
    private String id;

    private String name;
    private String description;
}
