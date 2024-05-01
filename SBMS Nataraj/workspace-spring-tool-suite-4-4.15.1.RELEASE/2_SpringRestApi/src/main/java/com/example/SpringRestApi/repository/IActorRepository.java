package com.example.SpringRestApi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SpringRestApi.entity.Actor;

public interface IActorRepository extends CrudRepository<Actor, Integer>{

}
