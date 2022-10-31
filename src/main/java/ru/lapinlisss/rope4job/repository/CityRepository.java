package ru.lapinlisss.rope4job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lapinlisss.rope4job.model.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
