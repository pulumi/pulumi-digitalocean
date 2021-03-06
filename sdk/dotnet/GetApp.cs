// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetApp
    {
        /// <summary>
        /// Get information on a DigitalOcean App.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Get the account:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var example = Output.Create(DigitalOcean.GetApp.InvokeAsync(new DigitalOcean.GetAppArgs
        ///         {
        ///             AppId = "e665d18d-7b56-44a9-92ce-31979174d544",
        ///         }));
        ///         this.DefaultIngress = example.Apply(example =&gt; example.DefaultIngress);
        ///     }
        /// 
        ///     [Output("defaultIngress")]
        ///     public Output&lt;string&gt; DefaultIngress { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAppResult> InvokeAsync(GetAppArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAppResult>("digitalocean:index/getApp:getApp", args ?? new GetAppArgs(), options.WithVersion());
    }


    public sealed class GetAppArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the app to retrieve information about.
        /// </summary>
        [Input("appId", required: true)]
        public string AppId { get; set; } = null!;

        public GetAppArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAppResult
    {
        /// <summary>
        /// The ID the app's currently active deployment.
        /// </summary>
        public readonly string ActiveDeploymentId;
        public readonly string AppId;
        /// <summary>
        /// The date and time of when the app was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The default URL to access the app.
        /// </summary>
        public readonly string DefaultIngress;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The live URL of the app.
        /// </summary>
        public readonly string LiveUrl;
        /// <summary>
        /// A DigitalOcean App spec describing the app.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAppSpecResult> Specs;
        /// <summary>
        /// The date and time of when the app was last updated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetAppResult(
            string activeDeploymentId,

            string appId,

            string createdAt,

            string defaultIngress,

            string id,

            string liveUrl,

            ImmutableArray<Outputs.GetAppSpecResult> specs,

            string updatedAt)
        {
            ActiveDeploymentId = activeDeploymentId;
            AppId = appId;
            CreatedAt = createdAt;
            DefaultIngress = defaultIngress;
            Id = id;
            LiveUrl = liveUrl;
            Specs = specs;
            UpdatedAt = updatedAt;
        }
    }
}
