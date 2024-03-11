// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetKubernetesVersions
    {
        /// <summary>
        /// Provides access to the available DigitalOcean Kubernetes Service versions.
        /// 
        /// ## Example Usage
        /// 
        /// ### Output a list of all available versions
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetKubernetesVersions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["k8s-versions"] = example.Apply(getKubernetesVersionsResult =&gt; getKubernetesVersionsResult.ValidVersions),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ### Create a Kubernetes cluster using the most recent version available
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetKubernetesVersions.Invoke();
        /// 
        ///     var example_cluster = new DigitalOcean.KubernetesCluster("example-cluster", new()
        ///     {
        ///         Region = "lon1",
        ///         Version = example.Apply(getKubernetesVersionsResult =&gt; getKubernetesVersionsResult.LatestVersion),
        ///         NodePool = new DigitalOcean.Inputs.KubernetesClusterNodePoolArgs
        ///         {
        ///             Name = "default",
        ///             Size = "s-1vcpu-2gb",
        ///             NodeCount = 3,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ### Pin a Kubernetes cluster to a specific minor version
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetKubernetesVersions.Invoke(new()
        ///     {
        ///         VersionPrefix = "1.22.",
        ///     });
        /// 
        ///     var example_cluster = new DigitalOcean.KubernetesCluster("example-cluster", new()
        ///     {
        ///         Region = "lon1",
        ///         Version = example.Apply(getKubernetesVersionsResult =&gt; getKubernetesVersionsResult.LatestVersion),
        ///         NodePool = new DigitalOcean.Inputs.KubernetesClusterNodePoolArgs
        ///         {
        ///             Name = "default",
        ///             Size = "s-1vcpu-2gb",
        ///             NodeCount = 3,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetKubernetesVersionsResult> InvokeAsync(GetKubernetesVersionsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKubernetesVersionsResult>("digitalocean:index/getKubernetesVersions:getKubernetesVersions", args ?? new GetKubernetesVersionsArgs(), options.WithDefaults());

        /// <summary>
        /// Provides access to the available DigitalOcean Kubernetes Service versions.
        /// 
        /// ## Example Usage
        /// 
        /// ### Output a list of all available versions
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetKubernetesVersions.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["k8s-versions"] = example.Apply(getKubernetesVersionsResult =&gt; getKubernetesVersionsResult.ValidVersions),
        ///     };
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ### Create a Kubernetes cluster using the most recent version available
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetKubernetesVersions.Invoke();
        /// 
        ///     var example_cluster = new DigitalOcean.KubernetesCluster("example-cluster", new()
        ///     {
        ///         Region = "lon1",
        ///         Version = example.Apply(getKubernetesVersionsResult =&gt; getKubernetesVersionsResult.LatestVersion),
        ///         NodePool = new DigitalOcean.Inputs.KubernetesClusterNodePoolArgs
        ///         {
        ///             Name = "default",
        ///             Size = "s-1vcpu-2gb",
        ///             NodeCount = 3,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// 
        /// ### Pin a Kubernetes cluster to a specific minor version
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetKubernetesVersions.Invoke(new()
        ///     {
        ///         VersionPrefix = "1.22.",
        ///     });
        /// 
        ///     var example_cluster = new DigitalOcean.KubernetesCluster("example-cluster", new()
        ///     {
        ///         Region = "lon1",
        ///         Version = example.Apply(getKubernetesVersionsResult =&gt; getKubernetesVersionsResult.LatestVersion),
        ///         NodePool = new DigitalOcean.Inputs.KubernetesClusterNodePoolArgs
        ///         {
        ///             Name = "default",
        ///             Size = "s-1vcpu-2gb",
        ///             NodeCount = 3,
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetKubernetesVersionsResult> Invoke(GetKubernetesVersionsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKubernetesVersionsResult>("digitalocean:index/getKubernetesVersions:getKubernetesVersions", args ?? new GetKubernetesVersionsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKubernetesVersionsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If provided, the provider will only return versions that match the string prefix. For example, `1.15.` will match all 1.15.x series releases.
        /// </summary>
        [Input("versionPrefix")]
        public string? VersionPrefix { get; set; }

        public GetKubernetesVersionsArgs()
        {
        }
        public static new GetKubernetesVersionsArgs Empty => new GetKubernetesVersionsArgs();
    }

    public sealed class GetKubernetesVersionsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// If provided, the provider will only return versions that match the string prefix. For example, `1.15.` will match all 1.15.x series releases.
        /// </summary>
        [Input("versionPrefix")]
        public Input<string>? VersionPrefix { get; set; }

        public GetKubernetesVersionsInvokeArgs()
        {
        }
        public static new GetKubernetesVersionsInvokeArgs Empty => new GetKubernetesVersionsInvokeArgs();
    }


    [OutputType]
    public sealed class GetKubernetesVersionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The most recent version available.
        /// </summary>
        public readonly string LatestVersion;
        /// <summary>
        /// A list of available versions.
        /// </summary>
        public readonly ImmutableArray<string> ValidVersions;
        public readonly string? VersionPrefix;

        [OutputConstructor]
        private GetKubernetesVersionsResult(
            string id,

            string latestVersion,

            ImmutableArray<string> validVersions,

            string? versionPrefix)
        {
            Id = id;
            LatestVersion = latestVersion;
            ValidVersions = validVersions;
            VersionPrefix = versionPrefix;
        }
    }
}
