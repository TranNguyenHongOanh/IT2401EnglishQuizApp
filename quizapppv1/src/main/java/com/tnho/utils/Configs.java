/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tnho.utils;

import com.tnho.services.CategoryServices;
import com.tnho.services.LevelServices;
import com.tnho.services.questions.QuestionServices;
import com.tnho.services.questions.UpdateQuestionServices;

/**
 *
 * @author admin
 */
public class Configs {
    public static final CategoryServices cateService = new CategoryServices();
    public static final QuestionServices questionService = new QuestionServices();
    public static final LevelServices lvlService = new LevelServices();
    public static final UpdateQuestionServices uQuestionService = new UpdateQuestionServices();
}
