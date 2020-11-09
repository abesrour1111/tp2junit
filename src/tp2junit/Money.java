package tp2junit;

class Money {
private int fAmount;
private String fCurrency;

public Money(int amount, String currency) { 
	fAmount = amount;
fCurrency = currency;
}
//extraire qte//
public int amount() {
return fAmount;
}

public String currency() {
return fCurrency;
}

public Money add(Money m) {
return new Money(amount() + m.amount(), currency());
}
public boolean equals(Money m)
{
	if (amount() == m.amount() && (currency().equals(m.currency())))
	return true;
	else
		return false;
}
}
