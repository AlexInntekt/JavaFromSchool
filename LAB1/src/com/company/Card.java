package com.company;


public abstract class Card
{
    private String IBAN;
    private long amount;

    public Card()
    {
        this.setAmount(100);
        this.setIban("NULL by default");
    }

    public void test()
    {
         System.out.print("Running card.test()");
    }



    protected void setIban(String setv)
    {
        this.IBAN = setv;
    }
    protected String getIban()
    {
        return this.IBAN;
    }


    protected void setAmount(long setv)
    {
        this.amount = setv;
    }

    protected long getAmount()
    {
        return this.amount;
    }

    public void DisplayInfo()
    {
        System.out.print("\n\n **** \n IBAN: " + this.getIban());
        System.out.print("\n Amount: " + this.getAmount());
        System.out.print("\n **** \n\n");
    }

}


class DebitCard extends Card
{
    public void deposit(long val)
    {
        long currentAmount = this.getAmount() + val;
        this.setAmount(currentAmount);
    }

    public String withdraw(long val)
    {package com.company;


        public abstract class Card
        {
            private String IBAN;
            private long amount;

            public Card()
            {
                this.setAmount(100);
                this.setIban("NULL by default");
            }

            public void test()
            {
                System.out.print("Running card.test()");
            }



            protected void setIban(String setv)
            {
                this.IBAN = setv;
            }
            protected String getIban()
            {
                return this.IBAN;
            }


            protected void setAmount(long setv)
            {
                this.amount = setv;
            }

            protected long getAmount()
            {
                return this.amount;
            }

            public void DisplayInfo()
            {
                System.out.print("\n\n **** \n IBAN: " + this.getIban());
                System.out.print("\n Amount: " + this.getAmount());
                System.out.print("\n **** \n\n");
            }

        }


        class DebitCard extends Card
        {
            public void deposit(long val)
            {
                long currentAmount = this.getAmount() + val;
                this.setAmount(currentAmount);
            }

            public String withdraw(long val)
            {
                String message = "No operation committed. \n";

                if(this.getAmount()>=val)
                {
                    long updatedAmount = this.getAmount() - val;
                    this.setAmount(updatedAmount);
                    message = "Succesfully witdhrawed " + val;
                    System.out.print(message);
                }
                else
                {
                    message = "Failed to perfom the withdraw. Insuficient funds.";
                    System.out.print(message);
                }

                return message;
            }

        }




        class CreditCard extends Card
        {
            public void deposit(long val)
            {
                long currentAmount = this.getAmount() + val;
                this.setAmount(currentAmount);
            }

            public String withdraw(long val)
            {
                String message = "No operation committed. \n";

                if(true)
                {
                    long updatedAmount = this.getAmount() - val;
                    this.setAmount(updatedAmount);
                    message = "Succesfully witdhrawed " + val;
                    System.out.print(message);
                }
                else
                {
                    message = "Failed to perfom the withdraw. Insuficient funds.";
                    System.out.print(message);
                }

                return message;
            }

        }

        String message = "No operation committed. \n";

        if(this.getAmount()>=val)
        {
            long updatedAmount = this.getAmount() - val;
            this.setAmount(updatedAmount);
            message = "Succesfully witdhrawed " + val;
            System.out.print(message);
        }
        else
        {
            message = "Failed to perfom the withdraw. Insuficient funds.";
            System.out.print(message);
        }

        return message;
    }

}




class CreditCard extends Card
{
    public void deposit(long val)
    {
        long currentAmount = this.getAmount() + val;
        this.setAmount(currentAmount);
    }

    public String withdraw(long val)
    {
        String message = "No operation committed. \n";

        if(true)
        {
            long updatedAmount = this.getAmount() - val;
            this.setAmount(updatedAmount);
            message = "Succesfully witdhrawed " + val;
            System.out.print(message);
        }
        else
        {
            message = "Failed to perfom the withdraw. Insuficient funds.";
            System.out.print(message);
        }

        return message;
    }

}
