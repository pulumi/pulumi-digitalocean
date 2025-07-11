// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean
{
    public static class GetAccount
    {
        /// <summary>
        /// Get information on your DigitalOcean account.
        /// 
        /// ## Example Usage
        /// 
        /// Get the account:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetAccount.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetAccountResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAccountResult>("digitalocean:index/getAccount:getAccount", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Get information on your DigitalOcean account.
        /// 
        /// ## Example Usage
        /// 
        /// Get the account:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetAccount.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAccountResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountResult>("digitalocean:index/getAccount:getAccount", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Get information on your DigitalOcean account.
        /// 
        /// ## Example Usage
        /// 
        /// Get the account:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DigitalOcean = Pulumi.DigitalOcean;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = DigitalOcean.GetAccount.Invoke();
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetAccountResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetAccountResult>("digitalocean:index/getAccount:getAccount", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetAccountResult
    {
        /// <summary>
        /// The total number of droplets current user or team may have active at one time.
        /// </summary>
        public readonly int DropletLimit;
        /// <summary>
        /// The email address used by the current user to register for DigitalOcean.
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// If true, the user has verified their account via email. False otherwise.
        /// </summary>
        public readonly bool EmailVerified;
        /// <summary>
        /// The total number of floating IPs the current user or team may have.
        /// </summary>
        public readonly int FloatingIpLimit;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// This value is one of "active", "warning" or "locked".
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// A human-readable message giving more details about the status of the account.
        /// </summary>
        public readonly string StatusMessage;
        /// <summary>
        /// The unique universal identifier for the current user.
        /// </summary>
        public readonly string Uuid;

        [OutputConstructor]
        private GetAccountResult(
            int dropletLimit,

            string email,

            bool emailVerified,

            int floatingIpLimit,

            string id,

            string status,

            string statusMessage,

            string uuid)
        {
            DropletLimit = dropletLimit;
            Email = email;
            EmailVerified = emailVerified;
            FloatingIpLimit = floatingIpLimit;
            Id = id;
            Status = status;
            StatusMessage = statusMessage;
            Uuid = uuid;
        }
    }
}
