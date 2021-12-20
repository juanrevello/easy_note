package com.example.easynotes.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "note_revision")
public class NoteRevision {

    @EmbeddedId
    NoteRevisionId id = new NoteRevisionId();

    @ManyToOne
    @MapsId("noteId")
    @JoinColumn(name = "revised_note_id")
    Note note;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "revisor_id")
    User user;

    @Column(name="revision_status", nullable = true)
//    @Enumerated(value = EnumType.STRING)
    private String revisionStatus;


    public NoteRevision(User user, Note note) {
        this.setUser(user);
        this.setNote(note);
    }

}

//enum RevisionStatus {
//    Aprobado,
//    Pendiente,
//    Desaprobado
//}
