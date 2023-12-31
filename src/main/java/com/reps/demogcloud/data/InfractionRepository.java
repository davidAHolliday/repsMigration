package com.reps.demogcloud.data;

import com.reps.demogcloud.models.infraction.Infraction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface InfractionRepository extends MongoRepository<Infraction, String> {
    Infraction findByInfractionId(String infractionId);
    Optional<Infraction> findByInfractionType (String type);
    Optional<Infraction> findByInfractionName (String infractionName);
}
