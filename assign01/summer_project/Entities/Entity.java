package summer_project.Entities;
public class Entity {

    private String firstName;
    private String lastName;
    private String role;

    public Entity()
    {
        firstName = "Undefined";
        lastName = "Undefined";
        role = "Undefined";
    }

    public Entity(String firstName, String lastName, String role)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String input)
    {
        this.firstName = input;
    }

    public void validateFirstName()
    {}

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String input)
    {
        this.lastName = input;
    }

    public String getRole()
    {
        return role;
    }

    public void setRole(String input)
    {
        this.role = input;
    }
}

