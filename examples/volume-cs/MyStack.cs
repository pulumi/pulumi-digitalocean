using Pulumi;
using DigitalOcean = Pulumi.DigitalOcean;

class MyStack : Stack
{
    public MyStack()
    {
        var volume = new DigitalOcean.Volume("demoNameCs", new DigitalOcean.VolumeArgs
        {
            Region = "lon1",
            Size = 100,
        });

        this.Name = volume.Name;
    }

    [Output] public Output<string> Name { get; set; }
}
