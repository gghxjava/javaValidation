package com.example.jakavalidation.annatation;

public @interface ParamIgnore {

    String message() default "###set resolveMulti = first\n" +
            "field.ignore[@com.example.jakavalidation.annatation.ParamIgnore]=groovy:```\n" +
            "    def ann = it.annMap(\"com.example.jakavalidation.annatation.ParamIgnore\")\n" +
            "   if(!session.get(\"javax-start-group\")){\n" +
            "        return  true\n" +
            "   }else{\n" +
            "        def annMaps = it.annMaps(\"com.example.jakavalidation.annatation.ParamIgnore\")\n" +
            "        ${javax_check_groups}\n" +
            "        if(yourConfition){\n" +
            "            return  true\n" +
            "        }else{\n" +
            "            return  false\n" +
            "        }\n" +
            "   }\n" +
            "```\n" +
            "###set resolveMulti = error";

    Class<?>[] groups() default {};

}
