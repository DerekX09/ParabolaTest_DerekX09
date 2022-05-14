import eu.mihosoft.vrl.v3d.Parabola

return [ Parabola.extrudeByEquation(5,0.27,0,1)
	.move(20,0,0),
	Parabola.coneByEquation(5,1.27,0.7)
	.move(30,0,0),
	Parabola.coneByFocalLength(10, 10).move(50,0,0),
	Parabola.cone(10, 20)		
]