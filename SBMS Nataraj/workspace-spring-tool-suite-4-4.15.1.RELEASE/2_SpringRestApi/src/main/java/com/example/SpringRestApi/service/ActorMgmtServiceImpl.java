package com.example.SpringRestApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRestApi.entity.Actor;
import com.example.SpringRestApi.repository.IActorRepository;

@Service("actorMgmtService")
public class ActorMgmtServiceImpl implements IActorMgmtService  {
	@Autowired
	private IActorRepository actorRepository;
	@Override
	public String registerActor(Actor actor) {
		Actor refRepo = actorRepository.save(actor);
		return "ActorDataSaved" + refRepo;
	}
	}
