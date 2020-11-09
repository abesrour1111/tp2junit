package tp2junit;

import java.util.Vector;

class PorteFeuille {
private Vector<Money> Pfeuille = new Vector<Money>();

PorteFeuille(Vector<Money> argent) {
	Pfeuille=argent;
	/*for (int i=0;i<Pfeuille.size();i++)
		appendMoney(argent.get(i));*/
}
public Vector<Money> appendMoney(Money m) {
if (Pfeuille.isEmpty()) { Pfeuille.add(m);} 
else {
int i = 0;
while ((i < Pfeuille.size()) // générer un test pour i=taille du vecteur
&& (!(Pfeuille.get(i).currency().equals(m.currency()))))
i++;
if (i >= Pfeuille.size()) { 
	Pfeuille.add(m);
	} 
else {
Pfeuille.set(i, new Money(Pfeuille.get(i).amount() + m.amount(),
		m.currency()));
       }
	 }
return Pfeuille; // test si le portefeuille est vide ou pas ??
  }
public boolean equals(Object o){
	boolean test=false;
	
	if (o instanceof PorteFeuille){
		PorteFeuille p=(PorteFeuille) o;
		//si le deux portefeuilles sont de tailles differentes == test false
		if (this.Pfeuille.size()!=p.Pfeuille.size()) {
			return test;
		}
		else {
			//sinn / on parcours le vecteur en v2rifiant si chaque 2l2ment du premier existe bien dans le deuxieme
			for (int i=0;i<this.Pfeuille.size();i++) {
				for (int j=0;j<p.Pfeuille.size();j++) {
					if ((this.Pfeuille.get(i).amount()==p.Pfeuille.get(j).amount()) && (this.Pfeuille.get(i).currency().equals(p.Pfeuille.get(j).currency())))
					{
						test=true;
						break;
					}
					else
						test=false;
//					
				}
				if (test==false)
					return false;
			}
			return test;
		}
	}
	else return test;
}		
public Vector<Money> getPfeuille() {
	return Pfeuille;
}
}

