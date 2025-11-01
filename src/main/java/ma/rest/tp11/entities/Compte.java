package ma.rest.tp11.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private TypeCompte type;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // ✅ Default constructor (very important)
    public Compte() {}

    // ✅ Constructor for seeding
    public Compte(Long id, double solde, Date dateCreation, TypeCompte type, Client client) {
        this.id = id;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
        this.client = client;
    }

    // getters and setters...
}
