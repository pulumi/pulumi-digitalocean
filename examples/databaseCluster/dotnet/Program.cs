using System.Collections.Generic;
using Pulumi;
using DigitalOcean = Pulumi.DigitalOcean;

return await Deployment.RunAsync(() => 
{
    var example = new DigitalOcean.DatabaseCluster("example", new()
    {
        Engine = "pg",
        NodeCount = 1,
        Region = "nyc3",
        Size = "db-s-1vcpu-1gb",
        Version = "11",
    });

});

