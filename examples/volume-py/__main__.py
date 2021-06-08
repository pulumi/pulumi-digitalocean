"""A Python Pulumi program"""

import pulumi
import pulumi_digitalocean as digitalocean

volume = digitalocean.Volume("demoNamePy",
                             region="lon1", size=100)

pulumi.export("name", volume.name)
