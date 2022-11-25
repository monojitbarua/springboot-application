package com.learn.demo.controllers;

import com.learn.demo.models.Skill;
import com.learn.demo.repositories.SkillRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/skills")
public class SkillController {
    @Autowired
    private SkillRepository skillRepository;

    @GetMapping
    public List<Skill> list() {
        return skillRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Skill get (@PathVariable Long id) {
        return skillRepository.getOne(id);
    }

    @PostMapping
    public Skill create (@RequestBody final Skill skill) {
       return skillRepository.saveAndFlush(skill);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete (@PathVariable Long id) {
        skillRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Skill update (@PathVariable Long id, @RequestBody Skill skill) {
        Skill existingSkill = skillRepository.getOne(id);
        BeanUtils.copyProperties(skill, existingSkill, "skill_id");
        return skillRepository.saveAndFlush(existingSkill);
    }
}
