<?xml version="1.0"?>
<flowgorithm fileversion="3.0">
    <attributes>
        <attribute name="name" value=""/>
        <attribute name="authors" value="sanch"/>
        <attribute name="about" value=""/>
        <attribute name="saved" value="2023-10-09 07:38:22 PM"/>
        <attribute name="created" value="c2FuY2g7RUxNT05POzIwMjMtMTAtMDk7MDc6MDc6MjYgUE07MjI2Ng=="/>
        <attribute name="edited" value="c2FuY2g7RUxNT05POzIwMjMtMTAtMDk7MDc6Mzg6MjIgUE07MTsyMzc0"/>
    </attributes>
    <function name="Main" type="None" variable="">
        <parameters/>
        <body>
            <declare name="valor1" type="Integer" array="False" size=""/>
            <declare name="valor2" type="Integer" array="False" size=""/>
            <output expression="&quot;Introducce valor 1&quot;" newline="True"/>
            <input variable="valor1"/>
            <output expression="&quot;introduce valor 2&quot;" newline="True"/>
            <input variable="valor2"/>
            <if expression="valor1 &gt; valor2">
                <then>
                    <output expression="&quot;El valor mas grande es &quot;" newline="False"/>
                    <output expression="valor1" newline="True"/>
                </then>
                <else>
                    <if expression="valor1 = valor2">
                        <then>
                            <output expression="valor1" newline="False"/>
                            <output expression="&quot; es igual que &quot;" newline="False"/>
                            <output expression="valor2" newline="True"/>
                        </then>
                        <else>
                            <output expression="&quot;El valor mas pequeno es &quot;" newline="False"/>
                            <output expression="valor1" newline="True"/>
                        </else>
                    </if>
                </else>
            </if>
        </body>
    </function>
</flowgorithm>
