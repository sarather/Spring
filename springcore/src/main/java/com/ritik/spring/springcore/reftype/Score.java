package com.ritik.spring.springcore.reftype;

public class Score {
	@Override
	public String toString() {
		return "Score [maths=" + maths + ", chemistry=" + chemistry + ", physics=" + physics + "]";
	}

	private double maths;
	private double chemistry;
	private double physics;

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}
}
